package pl.falcor;

import java.math.BigDecimal;
import java.math.RoundingMode;

class VowelsStats {

    private BigDecimal occurrence;
    private BigDecimal sum;

    VowelsStats(BigDecimal occurrence, BigDecimal sum) {
        this.occurrence = occurrence;
        this.sum = sum;
    }

    void increaseOccurrence() {
        this.occurrence = this.occurrence.add(new BigDecimal(1));
    }

    void setSum(int sum) {
        this.sum = this.sum.add(new BigDecimal(sum));
    }

    @Override
    public String toString() {
        return sum.divide(occurrence).toString();
    }
}