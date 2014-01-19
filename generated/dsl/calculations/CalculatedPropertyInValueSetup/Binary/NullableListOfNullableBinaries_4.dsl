module CalculatedPropertyInValueSetup
{
  value NullableListOfNullableBinaries_4 {
    List<Binary?>? nullableListOfNullableBinaries;

    calculated List<Binary?>? calculatedNullableListOfNullableBinaries from 'it => it.nullableListOfNullableBinaries';

    calculated List<Binary?>? persistedNullableListOfNullableBinaries from 'it => it.nullableListOfNullableBinaries' { persisted; }
  }
}
