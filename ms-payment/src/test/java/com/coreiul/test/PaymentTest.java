package com.coreiul.test;

import model.BookEntity;
import org.apache.commons.lang3.BooleanUtils;
import org.junit.Test;

public class PaymentTest {

        @Test
        public void testAssert() throws Exception {
            assertEquals(true);
        }

    private void assertEquals(boolean b) {
            if(BooleanUtils.isTrue(b))
            System.out.println("Sun Rises in the East");
            else
                System.out.println("Sun Rises in the West");
    }
    @Test
    public void bookService() {
        BookEntity book1 = new BookEntity();
        book1.setId(101L);
        book1.setdesc("Ponniyin Selvan");
        book1.getDetails(book1.getId(), book1.getDesc());

    }

}




