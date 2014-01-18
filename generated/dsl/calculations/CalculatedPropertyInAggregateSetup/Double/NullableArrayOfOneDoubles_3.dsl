module CalculatedPropertyInAggregateSetup
{
  aggregate NullableArrayOfOneDoubles_3 {
    Array<Double>? nullableArrayOfOneDoubles;

    calculated Array<Double>? calculatedNullableArrayOfOneDoubles from 'it => it.nullableArrayOfOneDoubles';

    calculated Array<Double>? persistedNullableArrayOfOneDoubles from 'it => it.nullableArrayOfOneDoubles' { persisted; }
  }
}
