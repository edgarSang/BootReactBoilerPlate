import React from 'react';
import { useDispatch, useSelector } from 'react-redux';
import Counter from '../../components/sample/Counter';
import { increment, decrement } from '../../store/modules/counter';

const CounterContainer = () => {
  const dispatch = useDispatch();

  const { number } = useSelector(({ counter }) => ({ num: counter.number }));

  const handleIncrease = () => {
    dispatch(increment());
  };

  const handleDecrease = () => {
    dispatch(decrement());
  };

  return (
    <Counter
      onIncrease={handleIncrease}
      onDecrease={handleDecrease}
      number={number}
    />
  );
};

export default CounterContainer;
