package com.converticshop.service;

import com.converticshop.model.Marca;
import com.converticshop.repository.MarcaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class MarcaService implements MarcaRepository {



    @Autowired
    private MarcaRepository marcaRepository;

    public List<Marca> findAll (){
        return marcaRepository.findAll();
    }






    @Override
    public void flush() {

    }

    @Override
    public <S extends Marca> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Marca> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Marca> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Marca getOne(Long aLong) {
        return null;
    }

    @Override
    public Marca getById(Long aLong) {
        return null;
    }

    @Override
    public Marca getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Marca> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Marca> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Marca> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Marca> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Marca> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Marca> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Marca, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends Marca> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Marca> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Marca> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<Marca> findAllById(Iterable<Long> longs) {
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
    public void delete(Marca entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Marca> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Marca> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Marca> findAll(Pageable pageable) {
        return null;
    }
}
