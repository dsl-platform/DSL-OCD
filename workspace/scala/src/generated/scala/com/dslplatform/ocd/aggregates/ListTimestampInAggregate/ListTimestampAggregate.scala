package com.dslplatform.ocd.aggregates.ListTimestampInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration
import com.fasterxml.jackson.annotation._

class ListTimestampAggregate @JsonIgnore() private(
    private var _URI: String,
    @transient private val _locator: Option[ServiceLocator],
    private var _listTimestamp: IndexedSeq[org.joda.time.DateTime]
  ) extends Serializable with AggregateRoot {

  @JsonGetter("URI")
  def URI = {
    _URI
  }

  private[ListTimestampInAggregate]def URI_= (value: String) {
    _URI = value

  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: ListTimestampAggregate => c.URI == URI
    case _ => false
  }

  override def toString = "ListTimestampAggregate("+ URI +")"

  @transient private lazy val _crudProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[CrudProxy]
  @transient private lazy val _domainProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[DomainProxy]

  def updateWithAnother(result: com.dslplatform.ocd.aggregates.ListTimestampInAggregate.ListTimestampAggregate): this.type = {
    this.URI = result.URI;
    this._listTimestamp = result._listTimestamp;
    this
  }
  def delete()(implicit ec: ExecutionContext, duration: Duration) =
    Await.result( _crudProxy.delete[com.dslplatform.ocd.aggregates.ListTimestampInAggregate.ListTimestampAggregate](URI), duration)

  def persist()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result((if (this.URI == null) _crudProxy.create(this) else _crudProxy.update(this)), duration)
    updateWithAnother(toUpdateWith)

  }

  @JsonGetter("listTimestamp")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  def listTimestamp = {
    _listTimestamp
  }

  def listTimestamp_= (value: IndexedSeq[org.joda.time.DateTime]) {
    _listTimestamp = value

  }

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: ServiceLocator
  , @JsonProperty("URI") URI: String
  , @JsonProperty("listTimestamp") listTimestamp: IndexedSeq[org.joda.time.DateTime]
  ) =
    this(_locator = Some(_locator), _URI = URI, _listTimestamp = if (listTimestamp == null) IndexedSeq.empty else listTimestamp)

}

object ListTimestampAggregate extends AggregateRootCompanion[ListTimestampAggregate]{

  def apply(
    listTimestamp: IndexedSeq[org.joda.time.DateTime] = IndexedSeq[org.joda.time.DateTime]()
  ) = {
    new ListTimestampAggregate(
      _locator = None
    , _URI = null
    , _listTimestamp = listTimestamp)
  }

}
