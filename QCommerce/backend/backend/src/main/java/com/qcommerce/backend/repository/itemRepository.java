package com.qcommerce.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface itemRepository extends JpaRepository<Category, String> {
}
