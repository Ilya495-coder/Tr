import org.example.CreditCardPayment;
import org.example.CryptoPayment;
import org.example.PayPalPayment;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class PaymentTest {
    @Test
            public void CreditCardPaymentgetAmount (){
        CreditCardPayment creditCardPayment = new CreditCardPayment(100.54);
        assertEquals(100.54, creditCardPayment.getAmount(),"Сумма должна совпадать");
    }
    @Test
    void testProcessPaymentNotThrowing() {
        CreditCardPayment payment = new CreditCardPayment(100.0);
        assertDoesNotThrow(payment::processPayment);
    }
    @Test
   public void  applyDiscountAddDiscount (){
        CreditCardPayment creditCardPayment = new CreditCardPayment(100.00);
        creditCardPayment.applyDiscount(10);
        assertEquals(90.0, creditCardPayment.getAmount(), 0.001, "После скидки сумма должна уменьшиться");
    }
    @Test
    public void validateAmountTrows(){
        assertThrows(IllegalArgumentException.class, () -> {
            CreditCardPayment creditCardPayment1=     new CreditCardPayment(-10);
            creditCardPayment1.validateAmount();
        });
    }

    @Test
    public void PayPalPaymentgetAmount (){
        PayPalPayment payPalPaymentp = new PayPalPayment(100.54);
        assertEquals(100.54, payPalPaymentp.getAmount(),"Сумма должнва совпадать");
    }

}
