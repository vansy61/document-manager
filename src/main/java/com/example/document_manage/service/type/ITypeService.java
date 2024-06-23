package com.example.document_manage.service.type;

import com.example.document_manage.model.Type;

public interface ITypeService {
    Iterable<Type> findAll();
    void save(Type type);
    Type findById(Long id);
    void delete(Long id);
}
