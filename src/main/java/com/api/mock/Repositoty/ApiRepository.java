package com.api.mock.Repositoty;

import javax.enterprise.context.ApplicationScoped;

import com.api.mock.entity.Api;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

@ApplicationScoped
public class ApiRepository implements PanacheRepositoryBase<Api, Long>{

}
