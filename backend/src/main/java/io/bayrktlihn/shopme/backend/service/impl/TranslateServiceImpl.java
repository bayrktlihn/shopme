package io.bayrktlihn.shopme.backend.service.impl;

import io.bayrktlihn.shopme.backend.service.TranslateService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class TranslateServiceImpl implements TranslateService {

    private final MessageSource messageSource;


    @Override
    public String instant(String key) {
        return messageSource.getMessage(key, null, LocaleContextHolder.getLocale());
    }

    @Override
    public String instant(String key, String defaultMessage) {
        return messageSource.getMessage(key, null, defaultMessage, LocaleContextHolder.getLocale());
    }

    @Override
    public String instant(String key, Object[] args, String defaultMessage) {
        return messageSource.getMessage(key, args, defaultMessage, LocaleContextHolder.getLocale());
    }

}
