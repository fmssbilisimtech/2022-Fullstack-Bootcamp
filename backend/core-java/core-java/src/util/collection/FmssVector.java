package util.collection;

import java.util.Collection;
import java.util.Vector;

public class FmssVector<E> extends Vector<E> {
    private final double m_capacityFactor;

    private void configureCapacityIncrement()
    {
        int curCapacity = capacity();

        capacityIncrement = (int)Math.floor(m_capacityFactor * curCapacity) - curCapacity;
    }

    public FmssVector()
    {
        this(10);
    }

    public FmssVector(double capacityFactor)
    {
        this(10, capacityFactor);
    }

    public FmssVector(int initialCapacity)
    {
        this(initialCapacity, 2);
    }

    public FmssVector(int initialCapacity, double capacityFactor)
    {
        super(initialCapacity);
        m_capacityFactor = capacityFactor;
        configureCapacityIncrement();
    }

    public FmssVector(Collection<? extends E> collection, double capacityFactor)
    {
        super(collection);
        m_capacityFactor = capacityFactor;
        configureCapacityIncrement();
    }

    @Override
    public synchronized void addElement(E obj)
    {
        configureCapacityIncrement();
        super.addElement(obj);
    }

    @Override
    public synchronized boolean add(E e)
    {
        configureCapacityIncrement();

        return super.add(e);
    }

    @Override
    public void add(int index, E element)
    {
        configureCapacityIncrement();

        super.add(index, element);
    }

    @Override
    public boolean addAll(Collection<? extends E> c)
    {
        configureCapacityIncrement();

        return super.addAll(c);
    }

    @Override
    public synchronized boolean addAll(int index, Collection<? extends E> c)
    {
        configureCapacityIncrement();

        return super.addAll(index, c);
    }
}