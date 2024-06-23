package com.example.document_manage.service.type;

import com.example.document_manage.model.Type;
import com.example.document_manage.repository.TypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TypeService implements ITypeService {
    @Autowired
    private TypeRepository typeRepository;

    @Override
    public Iterable<Type> findAll() {
        return typeRepository.findAll();
    }
}
