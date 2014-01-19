module CalculatedPropertyInValueSetup
{
  value NullableListOfOneLongs_4 {
    List<Long>? nullableListOfOneLongs;

    calculated List<Long>? calculatedNullableListOfOneLongs from 'it => it.nullableListOfOneLongs';

    calculated List<Long>? persistedNullableListOfOneLongs from 'it => it.nullableListOfOneLongs' { persisted; }
  }
}
