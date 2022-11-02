package com.ise.Interface;

import com.ise.Emuns.DocumentType;

public interface Application {
    
    public boolean submit();
    public boolean addDocument(Document document, DocumentType type);
}
