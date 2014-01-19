module CalculatedPropertyInValueSetup
{
  value OneGuid_5 {
    Guid oneGuid;

    calculated Guid calculatedOneGuid from 'it => it.oneGuid';

    calculated Guid persistedOneGuid from 'it => it.oneGuid' { persisted; }
  }
}
