package com.webapp.bankingportal.entity;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class TransactionSetIdTest {

	@Test
	public void setValidId() {
		TransactionSet transactionSet = new TransactionSet();
		Long validId = 123L;
		transactionSet.setId(validId);
		assertEquals(validId, transactionSet.id);
	}

	@Test
	public void setNullId() {
		TransactionSet transactionSet = new TransactionSet();
		transactionSet.setId(null);
		assertNull(transactionSet.id);
	}

	@Test
	public void setExistingId() {
		TransactionSet transactionSet = new TransactionSet();
		Long initialId = 123L;
		transactionSet.setId(initialId);
		Long newId = 456L;
		transactionSet.setId(newId);
		assertEquals(newId, transactionSet.id);
	}

	@Test
	public void setExtremeId() {
		TransactionSet transactionSet = new TransactionSet();
		transactionSet.setId(Long.MAX_VALUE);
		assertEquals(Long.MAX_VALUE, transactionSet.id);
		transactionSet.setId(Long.MIN_VALUE);
		assertEquals(Long.MIN_VALUE, transactionSet.id);
	}

	@Test
	public void setMultipleIds() {
		TransactionSet transactionSet = new TransactionSet();
		Long id1 = 123L;
		Long id2 = 456L;
		Long id3 = 789L;
		transactionSet.setId(id1);
		assertEquals(id1, transactionSet.id);
		transactionSet.setId(id2);
		assertEquals(id2, transactionSet.id);
		transactionSet.setId(id3);
		assertEquals(id3, transactionSet.id);
	}

}