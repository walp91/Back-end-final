package com.converticshop.service;

import com.converticshop.model.Talla;
import com.converticshop.repository.TallaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class TallaService implements TallaRepository{

    @Autowired
    private TallaRepository tallaRepository;


    //Mostrar tallas
    @Override
    public List<Talla>  findAll() {
        return tallaRepository.findAll();
    }








    @Override
    public <S extends Talla> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Talla> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Talla> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Talla> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Talla getOne(Long aLong) {
        return null;
    }

    @Override
    public Talla getById(Long aLong) {
        return null;
    }

    @Override
    public Talla getReferenceById(Long aLong) {
        return null;
    }



    @Override
    public <S extends Talla> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }



    @Override
    public <S extends Talla> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Talla> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Talla> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Talla> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Talla, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends Talla> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Talla> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Talla> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }



    @Override
    public List<Talla> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Talla entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Talla> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Talla> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Talla> findAll(Pageable pageable) {
        return null;
    }
}


