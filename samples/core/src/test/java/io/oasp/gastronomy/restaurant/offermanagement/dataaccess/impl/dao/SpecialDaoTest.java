package io.oasp.gastronomy.restaurant.offermanagement.dataaccess.impl.dao;

import static org.junit.Assert.assertTrue;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.transaction.annotation.Transactional;

import io.oasp.gastronomy.restaurant.SpringBootApp;
import io.oasp.gastronomy.restaurant.offermanagement.dataaccess.api.dao.SpecialDao;
import io.oasp.module.test.common.base.ComponentTest;

/**
 * @author DSTANKIE
 *
 */
@Transactional
@SpringBootTest(classes = { SpringBootApp.class }, webEnvironment = WebEnvironment.RANDOM_PORT)
public class SpecialDaoTest extends ComponentTest {

  @Inject
  SpecialDao specialDao;

  @PersistenceContext
  private EntityManager entityManager;

  @Test
  public void shouldReturnActiveSpecialOffers() {

    assertTrue(false);
  }

}
