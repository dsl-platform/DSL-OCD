module CalculatedPropertyInAggregateSetup
{
  aggregate NullableMoney_3 {
    Money? nullableMoney;

    calculated Money? calculatedNullableMoney from 'it => it.nullableMoney';

    calculated Money? persistedNullableMoney from 'it => it.nullableMoney' { persisted; }
  }
}
