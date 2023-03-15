package com.converticshop.service;

import com.converticshop.model.Categoria;
import com.converticshop.repository.CategoriaRepository;
import com.converticshop.repository.MarcaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;


@Service
public class CategoriaService implements CategoriaRepository {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public static List<Categoria> findAll(){
        return categoriaRepository.findAll();
    }
















    @Override
    public void flush() {

    }

    @Override
    public <S extends Categoria> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Categoria> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Categoria> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Categoria getOne(Long aLong) {
        return null;
    }

    @Override
    public Categoria getById(Long aLong) {
        return null;
    }

    @Override
    public Categoria getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Categoria> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Categoria> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Categoria> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Categoria> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Categoria> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Categoria> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Categoria, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends Categoria> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Categoria> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Categoria> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }


    @Override
    public List<Categoria> findAllById(Iterable<Long> longs) {
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
    public void delete(Categoria entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Categoria> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Categoria> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Categoria> findAll(Pageable pageable) {
        return null;
    }
}
