module CalculatedPropertyInAggregateSetup
{
  aggregate NullableListOfOneLongs_3 {
    List<Long>? nullableListOfOneLongs;

    calculated List<Long>? calculatedNullableListOfOneLongs from 'it => it.nullableListOfOneLongs';

    calculated List<Long>? persistedNullableListOfOneLongs from 'it => it.nullableListOfOneLongs' { persisted; }
  }
}
