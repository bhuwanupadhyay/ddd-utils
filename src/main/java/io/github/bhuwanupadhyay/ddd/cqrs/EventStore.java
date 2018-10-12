package io.github.bhuwanupadhyay.ddd.cqrs;

import io.github.bhuwanupadhyay.ddd.ddd.AggregateRoot;
import io.github.bhuwanupadhyay.ddd.ddd.DomainEvent;

import java.util.List;

public interface EventStore {

    <T> void saveEvents(AggregateRoot<T> root);

    <T> List<DomainEvent> getEvents(AggregateRoot<T> root);
}