module CalculatedPropertyInValueSetup
{
  value NullableUrl_4 {
    Url? nullableUrl;

    calculated Url? calculatedNullableUrl from 'it => it.nullableUrl';

    calculated Url? persistedNullableUrl from 'it => it.nullableUrl' { persisted; }
  }
}
