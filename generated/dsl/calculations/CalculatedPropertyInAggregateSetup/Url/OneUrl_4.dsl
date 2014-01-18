module CalculatedPropertyInAggregateSetup
{
  aggregate OneUrl_4 {
    Url oneUrl;

    calculated Url calculatedOneUrl from 'it => it.oneUrl';

    calculated Url persistedOneUrl from 'it => it.oneUrl' { persisted; }
  }
}
