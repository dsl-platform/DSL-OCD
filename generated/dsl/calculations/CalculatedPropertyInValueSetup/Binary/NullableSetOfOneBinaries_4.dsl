module CalculatedPropertyInValueSetup
{
  value NullableSetOfOneBinaries_4 {
    Set<Binary>? nullableSetOfOneBinaries;

    calculated Set<Binary>? calculatedNullableSetOfOneBinaries from 'it => it.nullableSetOfOneBinaries';

    calculated Set<Binary>? persistedNullableSetOfOneBinaries from 'it => it.nullableSetOfOneBinaries' { persisted; }
  }
}
