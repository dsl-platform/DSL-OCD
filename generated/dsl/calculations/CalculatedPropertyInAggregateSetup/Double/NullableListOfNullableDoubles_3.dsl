module CalculatedPropertyInAggregateSetup
{
  aggregate NullableListOfNullableDoubles_3 {
    List<Double?>? nullableListOfNullableDoubles;

    calculated List<Double?>? calculatedNullableListOfNullableDoubles from 'it => it.nullableListOfNullableDoubles';

    calculated List<Double?>? persistedNullableListOfNullableDoubles from 'it => it.nullableListOfNullableDoubles' { persisted; }
  }
}
