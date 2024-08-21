
package com.lmg.digitization.digital.wallet.response;

import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WalletTransactionsResponse {

	@JsonProperty("shukran_id")
	private String shukranId;

	@JsonProperty("wallet_balance")
	private BigDecimal walletBalance;

	@JsonProperty("currency")
	private String currency;

	@JsonProperty("no_of_days")
	private Integer noOfDays;

	@JsonProperty("page_number")
	private Integer pageNumber;

	@JsonProperty("total_pages")
	private Integer totalPages;

	@JsonProperty("page_size")
	private Integer pageSize;

	@JsonProperty("total_transactions")
	private Integer totalTransactions;

	@JsonProperty("transactions")
	private List<TransactionDetail> transactions;

	public Integer getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(Integer noOfDays) {
		this.noOfDays = noOfDays;
	}

	public Integer getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(Integer totalPages) {
		this.totalPages = totalPages;
	}

	public Integer getTotalTransactions() {
		return totalTransactions;
	}

	public void setTotalTransactions(Integer totalTransactions) {
		this.totalTransactions = totalTransactions;
	}

	public String getShukranId() {
		return shukranId;
	}

	public void setShukranId(String shukranId) {
		this.shukranId = shukranId;
	}

	public List<TransactionDetail> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<TransactionDetail> transactions) {
		this.transactions = transactions;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public BigDecimal getWalletBalance() {
		return walletBalance;
	}

	public void setWalletBalance(BigDecimal walletBalance) {
		this.walletBalance = walletBalance;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

}
