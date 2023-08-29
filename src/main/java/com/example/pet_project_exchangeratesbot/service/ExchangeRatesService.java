package com.example.pet_project_exchangeratesbot.service;

import com.example.pet_project_exchangeratesbot.exception.ServiceException;
import org.springframework.stereotype.Repository;

@Repository
public interface ExchangeRatesService {

    String getUSDExchangeRate() throws ServiceException;

    String getEURExchangeRate() throws ServiceException;

}
