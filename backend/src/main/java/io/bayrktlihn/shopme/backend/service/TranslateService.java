package io.bayrktlihn.shopme.backend.service;

public interface TranslateService {
    String instant(String key);

    String instant(String key, String defaultMessage);

    String instant(String key, Object[] args, String defaultMessage);

}
