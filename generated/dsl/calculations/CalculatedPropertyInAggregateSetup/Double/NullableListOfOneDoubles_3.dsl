module CalculatedPropertyInAggregateSetup
{
  aggregate NullableListOfOneDoubles_3 {
    List<Double>? nullableListOfOneDoubles;

    calculated List<Double>? calculatedNullableListOfOneDoubles from 'it => it.nullableListOfOneDoubles';

    calculated List<Double>? persistedNullableListOfOneDoubles from 'it => it.nullableListOfOneDoubles' { persisted; }
  }
}
