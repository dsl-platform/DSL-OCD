package com.dslplatform.ocd.aggregates.ArrayTimestampInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration
import com.fasterxml.jackson.annotation._

class ArrayTimestampAggregate @JsonIgnore() private(
    private var _URI: String,
    @transient private val _locator: Option[ServiceLocator],
    private var _arrayTimestamp: Array[org.joda.time.DateTime]
  ) extends Serializable with AggregateRoot {

  @JsonGetter("URI")
  def URI = {
    _URI
  }

  private[ArrayTimestampInAggregate]def URI_= (value: String) {
    _URI = value

  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: ArrayTimestampAggregate => c.URI == URI
    case _ => false
  }

  override def toString = "ArrayTimestampAggregate("+ URI +")"

  @transient private lazy val _crudProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[CrudProxy]
  @transient private lazy val _domainProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[DomainProxy]

  def updateWithAnother(result: com.dslplatform.ocd.aggregates.ArrayTimestampInAggregate.ArrayTimestampAggregate): this.type = {
    this.URI = result.URI;
    this._arrayTimestamp = result._arrayTimestamp;
    this
  }
  def delete()(implicit ec: ExecutionContext, duration: Duration) =
    Await.result( _crudProxy.delete[com.dslplatform.ocd.aggregates.ArrayTimestampInAggregate.ArrayTimestampAggregate](URI), duration)

  def persist()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result((if (this.URI == null) _crudProxy.create(this) else _crudProxy.update(this)), duration)
    updateWithAnother(toUpdateWith)

  }

  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  @JsonGetter("arrayTimestamp")
  def arrayTimestamp = {
    _arrayTimestamp
  }

  def arrayTimestamp_= (value: Array[org.joda.time.DateTime]) {
    _arrayTimestamp = value

  }

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: ServiceLocator
  , @JsonProperty("URI") URI: String
  , @JsonProperty("arrayTimestamp") arrayTimestamp: Array[org.joda.time.DateTime]
  ) =
    this(_locator = Some(_locator), _URI = URI, _arrayTimestamp = if (arrayTimestamp == null) Array.empty else arrayTimestamp)

}

object ArrayTimestampAggregate extends AggregateRootCompanion[ArrayTimestampAggregate]{

  def apply(
    arrayTimestamp: Array[org.joda.time.DateTime] = Array.empty
  ) = {
    new ArrayTimestampAggregate(
      _locator = None
    , _URI = null
    , _arrayTimestamp = arrayTimestamp)
  }

}
