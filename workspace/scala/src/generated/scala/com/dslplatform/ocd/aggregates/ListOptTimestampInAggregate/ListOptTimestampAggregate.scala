package com.dslplatform.ocd.aggregates.ListOptTimestampInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration
import com.fasterxml.jackson.annotation._

class ListOptTimestampAggregate @JsonIgnore() private(
    private var _URI: String,
    @transient private val _locator: Option[ServiceLocator],
    private var _listOptTimestamp: IndexedSeq[Option[org.joda.time.DateTime]]
  ) extends Serializable with AggregateRoot {

  @JsonGetter("URI")
  def URI = {
    _URI
  }

  private[ListOptTimestampInAggregate]def URI_= (value: String) {
    _URI = value

  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: ListOptTimestampAggregate => c.URI == URI
    case _ => false
  }

  override def toString = "ListOptTimestampAggregate("+ URI +")"

  @transient private lazy val _crudProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[CrudProxy]
  @transient private lazy val _domainProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[DomainProxy]

  def updateWithAnother(result: com.dslplatform.ocd.aggregates.ListOptTimestampInAggregate.ListOptTimestampAggregate): this.type = {
    this.URI = result.URI;
    this._listOptTimestamp = result._listOptTimestamp;
    this
  }
  def delete()(implicit ec: ExecutionContext, duration: Duration) =
    Await.result( _crudProxy.delete[com.dslplatform.ocd.aggregates.ListOptTimestampInAggregate.ListOptTimestampAggregate](URI), duration)

  def persist()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result((if (this.URI == null) _crudProxy.create(this) else _crudProxy.update(this)), duration)
    updateWithAnother(toUpdateWith)

  }

  @JsonGetter("listOptTimestamp")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  def listOptTimestamp = {
    _listOptTimestamp
  }

  def listOptTimestamp_= (value: IndexedSeq[Option[org.joda.time.DateTime]]) {
    _listOptTimestamp = value

  }

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: ServiceLocator
  , @JsonProperty("URI") URI: String
  , @JsonProperty("listOptTimestamp") listOptTimestamp: IndexedSeq[Option[org.joda.time.DateTime]]
  ) =
    this(_locator = Some(_locator), _URI = URI, _listOptTimestamp = if (listOptTimestamp == null) IndexedSeq.empty else listOptTimestamp)

}

object ListOptTimestampAggregate extends AggregateRootCompanion[ListOptTimestampAggregate]{

  def apply(
    listOptTimestamp: IndexedSeq[Option[org.joda.time.DateTime]] = IndexedSeq[Option[org.joda.time.DateTime]]()
  ) = {
    new ListOptTimestampAggregate(
      _locator = None
    , _URI = null
    , _listOptTimestamp = listOptTimestamp)
  }

}
