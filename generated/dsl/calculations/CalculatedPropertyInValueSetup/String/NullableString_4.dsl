module CalculatedPropertyInValueSetup
{
  value NullableString_4 {
    String? nullableString;

    calculated String? calculatedNullableString from 'it => it.nullableString';

    calculated String? persistedNullableString from 'it => it.nullableString' { persisted; }
  }
}
