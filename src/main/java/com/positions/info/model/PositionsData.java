package com.positions.info.model;

import java.math.BigDecimal;

public class PositionsData {

	private BigDecimal netprofit;
	
	private BigDecimal netLoss;
	
	private BigDecimal percentageLossOrGain;

	public PositionsData() {
	}

	public PositionsData(BigDecimal netprofit, BigDecimal netLoss, BigDecimal percentageLossOrGain) {
		super();
		this.netprofit = netprofit;
		this.netLoss = netLoss;
		this.percentageLossOrGain = percentageLossOrGain;
	}

	public BigDecimal getNetprofit() {
		return netprofit;
	}

	public void setNetprofit(BigDecimal netprofit) {
		this.netprofit = netprofit;
	}

	public BigDecimal getNetLoss() {
		return netLoss;
	}

	public void setNetLoss(BigDecimal netLoss) {
		this.netLoss = netLoss;
	}

	public BigDecimal getPercentageLossOrGain() {
		return percentageLossOrGain;
	}

	public void setPercentageLossOrGain(BigDecimal percentageLossOrGain) {
		this.percentageLossOrGain = percentageLossOrGain;
	}
}
