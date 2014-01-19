module CalculatedPropertyInValueSetup
{
  value NullableMoney_4 {
    Money? nullableMoney;

    calculated Money? calculatedNullableMoney from 'it => it.nullableMoney';

    calculated Money? persistedNullableMoney from 'it => it.nullableMoney' { persisted; }
  }
}
