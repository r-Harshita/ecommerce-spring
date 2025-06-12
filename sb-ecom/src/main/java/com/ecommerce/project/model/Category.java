package com.ecommerce.project.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "Categories")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long categoryId;
    private String categoryName;

//
//    public Category(Long categoryId, String categoryName) {
//        this.categoryId = categoryId;
//        this.categoryName = categoryName;
//    }
//
//    public Category() {
//        /* no-argument constructor
//         JPA (Jakarta Persistence API) requires a no-argument constructor for every entity class.
//         This constructor can be public or protected, but it must exist so the JPA provider (like Hibernate)
//         can instantiate the object using reflection. */
//    }
//
//    /**
//     * @return Long return the categoryId
//     */
//    public Long getCategoryId() {
//        return categoryId;
//    }
//
//    /**
//     * @param categoryId the categoryId to set
//     */
//    public void setCategoryId(Long categoryId) {
//        this.categoryId = categoryId;
//    }
//
//    /**
//     * @return String return the categoryName
//     */
//    public String getCategoryName() {
//        return categoryName;
//    }
//
//    /**
//     * @param categoryName the categoryName to set
//     */
//    public void setCategoryName(String categoryName) {
//        this.categoryName = categoryName;
//    }

}