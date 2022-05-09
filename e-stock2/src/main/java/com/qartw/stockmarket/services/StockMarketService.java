package com.qartw.stockmarket.services;

import java.time.LocalDate;
import java.util.List;

import com.qartw.stockmarket.dto.CompanyStockDetailsDTO;
import com.qartw.stockmarket.dto.StockPriceDetailsDTO;
import com.qartw.stockmarket.dto.StockPriceIndexDTO;

public interface StockMarketService {
	
	public StockPriceDetailsDTO saveStockPriceDetails(StockPriceDetailsDTO stockPriceDetailsDTO);
	public List<StockPriceDetailsDTO> getStockByCode(Long companyCode);
	public StockPriceIndexDTO getStockPriceIndex(Long companyCode, LocalDate startDate, LocalDate endDate);
	public CompanyStockDetailsDTO getAllStocksDetailsByCompanyCode(Long companyCode);

}
