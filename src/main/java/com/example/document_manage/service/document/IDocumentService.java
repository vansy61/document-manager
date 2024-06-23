package com.example.document_manage.service.document;

import com.example.document_manage.model.Document;
import org.springframework.data.domain.Page;

import java.util.Map;

public interface IDocumentService {
    Page<Document> findAll(int page, int size, String sort, String search, Long typeId);
}
