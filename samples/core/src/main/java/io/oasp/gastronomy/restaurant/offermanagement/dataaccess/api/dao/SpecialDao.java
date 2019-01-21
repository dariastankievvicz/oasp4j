package io.oasp.gastronomy.restaurant.offermanagement.dataaccess.api.dao;

import java.util.List;

import io.oasp.gastronomy.restaurant.offermanagement.dataaccess.api.SpecialEntity;

/**
 * @author DSTANKIE
 *
 */
public interface SpecialDao {

  List<SpecialEntity> findActual();

}
