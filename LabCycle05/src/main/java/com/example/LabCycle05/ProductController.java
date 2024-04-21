package com.example.LabCycle05;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/products")
public class ProductController {
	
	private final List<Product> products = new ArrayList<>();

    @PostMapping
    public ResponseEntity<?> addProduct(@Valid @RequestBody Product product, BindingResult result) {
        List<String> displayErrors = new ArrayList<>();
        if (result.hasErrors()) {
            List<FieldError> errors = result.getFieldErrors();
            for (FieldError err : errors) {
                displayErrors.add(err.getField() + ": " + err.getDefaultMessage());
            }
            return ResponseEntity.badRequest().body(displayErrors);
        }
        products.add(product);
        return ResponseEntity.status(HttpStatus.CREATED).body(product);
    }

    @GetMapping
    public List<Product> getProducts() {
        return products;
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getProductById(@PathVariable Long id) {
        Optional<Product> foundProduct = products.stream().filter(product -> product.getId().equals(id)).findFirst();
        return foundProduct.map(product -> ResponseEntity.ok().body(product))
                .orElse(ResponseEntity.notFound().build());
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<?> updateProduct(@PathVariable Long id, @Valid @RequestBody Product updatedProduct, BindingResult result) {
    	if (result.hasErrors()) {
    		List<String> errors = new ArrayList<>();
    		result.getFieldErrors().forEach(error -> errors.add(error.getField() + ": " +
    				error.getDefaultMessage()));
    		return ResponseEntity.badRequest().body(errors);
    	}
    	Product productToUpdate = products.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
    	if (productToUpdate != null) {
    		productToUpdate.setName(updatedProduct.getName());
    		productToUpdate.setPrice(updatedProduct.getPrice());
    		return ResponseEntity.ok(productToUpdate);
    	} 
    	else {
    		return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Product not found");
    	}
    }
	
}