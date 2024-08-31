package org.demo.stockmarket.entity;
/**
  * @author Leu A. Manuel
 * @see https://github.com/Leupesquisa
 */
import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;

@Entity
public class MarketData extends PanacheEntity {

    public String company;
    public String month;
    public double open;
    public double high;
    public double low;
    public double close;
    public long volume;
}
