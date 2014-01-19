module CalculatedPropertyInValueSetup
{
  value OneUrl_5 {
    Url oneUrl;

    calculated Url calculatedOneUrl from 'it => it.oneUrl';

    calculated Url persistedOneUrl from 'it => it.oneUrl' { persisted; }
  }
}
