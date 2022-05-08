package com.company.homework15.demo.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

public class ShareRate extends BaseModel{
    private LocalDateTime operDate;
    private long share;
    private BigDecimal rate;

    public ShareRate() {
    }

    public ShareRate(long id, LocalDateTime operDate, long share_id, BigDecimal rate) {
        super(id);
        this.operDate = operDate;
        this.share = share_id;
        this.rate = rate;
    }

    public LocalDateTime getOperDate() {
        return operDate;
    }

    public void setOperDate(LocalDateTime operDate) {
        this.operDate = operDate;
    }

    public long getShare() {
        return share;
    }

    public void setShare(long share) {
        this.share = share;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ShareRate shareRate = (ShareRate) o;
        return share == shareRate.share && Objects.equals(operDate, shareRate.operDate) && Objects.equals(rate, shareRate.rate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), operDate, share, rate);
    }
}