package com.example.document_manage.repository;

import com.example.document_manage.model.Type;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface TypeRepository extends PagingAndSortingRepository<Type, Long> {
}
