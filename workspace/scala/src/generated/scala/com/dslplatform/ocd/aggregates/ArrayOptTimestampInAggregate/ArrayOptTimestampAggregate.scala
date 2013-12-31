package com.dslplatform.ocd.aggregates.ArrayOptTimestampInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration
import com.fasterxml.jackson.annotation._

class ArrayOptTimestampAggregate @JsonIgnore() private(
    private var _URI: String,
    @transient private val _locator: Option[ServiceLocator],
    private var _arrayOptTimestamp: Array[Option[org.joda.time.DateTime]]
  ) extends Serializable with AggregateRoot {

  @JsonGetter("URI")
  def URI = {
    _URI
  }

  private[ArrayOptTimestampInAggregate]def URI_= (value: String) {
    _URI = value

  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: ArrayOptTimestampAggregate => c.URI == URI
    case _ => false
  }

  override def toString = "ArrayOptTimestampAggregate("+ URI +")"

  @transient private lazy val _crudProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[CrudProxy]
  @transient private lazy val _domainProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[DomainProxy]

  def updateWithAnother(result: com.dslplatform.ocd.aggregates.ArrayOptTimestampInAggregate.ArrayOptTimestampAggregate): this.type = {
    this.URI = result.URI;
    this._arrayOptTimestamp = result._arrayOptTimestamp;
    this
  }
  def delete()(implicit ec: ExecutionContext, duration: Duration) =
    Await.result( _crudProxy.delete[com.dslplatform.ocd.aggregates.ArrayOptTimestampInAggregate.ArrayOptTimestampAggregate](URI), duration)

  def persist()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result((if (this.URI == null) _crudProxy.create(this) else _crudProxy.update(this)), duration)
    updateWithAnother(toUpdateWith)

  }

  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  @JsonGetter("arrayOptTimestamp")
  def arrayOptTimestamp = {
    _arrayOptTimestamp
  }

  def arrayOptTimestamp_= (value: Array[Option[org.joda.time.DateTime]]) {
    _arrayOptTimestamp = value

  }

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: ServiceLocator
  , @JsonProperty("URI") URI: String
  , @JsonProperty("arrayOptTimestamp") arrayOptTimestamp: Array[Option[org.joda.time.DateTime]]
  ) =
    this(_locator = Some(_locator), _URI = URI, _arrayOptTimestamp = if (arrayOptTimestamp == null) Array.empty else arrayOptTimestamp)

}

object ArrayOptTimestampAggregate extends AggregateRootCompanion[ArrayOptTimestampAggregate]{

  def apply(
    arrayOptTimestamp: Array[Option[org.joda.time.DateTime]] = Array.empty
  ) = {
    new ArrayOptTimestampAggregate(
      _locator = None
    , _URI = null
    , _arrayOptTimestamp = arrayOptTimestamp)
  }

}
