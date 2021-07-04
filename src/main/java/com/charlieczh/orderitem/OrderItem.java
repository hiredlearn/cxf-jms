
package com.charlieczh.orderitem;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.charlieczh.perfume.Perfume;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}long" form="qualified"/&gt;
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}long" form="qualified"/&gt;
 *         &lt;element ref="{http://www.charlieczh.com/perfume}perfume"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "amount",
    "quantity",
    "perfume"
})
@XmlRootElement(name = "orderItem")
public class OrderItem {

    protected long amount;
    protected long quantity;
    @XmlElement(namespace = "http://www.charlieczh.com/perfume", required = true)
    protected Perfume perfume;

    /**
     * Gets the value of the amount property.
     * 
     */
    public long getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     */
    public void setAmount(long value) {
        this.amount = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     */
    public long getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     */
    public void setQuantity(long value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the perfume property.
     * 
     * @return
     *     possible object is
     *     {@link Perfume }
     *     
     */
    public Perfume getPerfume() {
        return perfume;
    }

    /**
     * Sets the value of the perfume property.
     * 
     * @param value
     *     allowed object is
     *     {@link Perfume }
     *     
     */
    public void setPerfume(Perfume value) {
        this.perfume = value;
    }

}
