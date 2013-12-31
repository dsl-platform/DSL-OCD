package com.dslplatform.ocd.aggregates.ArrayLongInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration
import com.fasterxml.jackson.annotation._

class ArrayLongAggregate @JsonIgnore() private(
    private var _URI: String,
    @transient private val _locator: Option[ServiceLocator],
    private var _arrayLong: Array[Long]
  ) extends Serializable with AggregateRoot {

  @JsonGetter("URI")
  def URI = {
    _URI
  }

  private[ArrayLongInAggregate]def URI_= (value: String) {
    _URI = value

  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: ArrayLongAggregate => c.URI == URI
    case _ => false
  }

  override def toString = "ArrayLongAggregate("+ URI +")"

  @transient private lazy val _crudProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[CrudProxy]
  @transient private lazy val _domainProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[DomainProxy]

  def updateWithAnother(result: com.dslplatform.ocd.aggregates.ArrayLongInAggregate.ArrayLongAggregate): this.type = {
    this.URI = result.URI;
    this._arrayLong = result._arrayLong;
    this
  }
  def delete()(implicit ec: ExecutionContext, duration: Duration) =
    Await.result( _crudProxy.delete[com.dslplatform.ocd.aggregates.ArrayLongInAggregate.ArrayLongAggregate](URI), duration)

  def persist()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result((if (this.URI == null) _crudProxy.create(this) else _crudProxy.update(this)), duration)
    updateWithAnother(toUpdateWith)

  }

  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  @JsonGetter("arrayLong")
  def arrayLong = {
    _arrayLong
  }

  def arrayLong_= (value: Array[Long]) {
    _arrayLong = value

  }

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: ServiceLocator
  , @JsonProperty("URI") URI: String
  , @JsonProperty("arrayLong") arrayLong: Array[Long]
  ) =
    this(_locator = Some(_locator), _URI = URI, _arrayLong = if (arrayLong == null) Array.empty else arrayLong)

}

object ArrayLongAggregate extends AggregateRootCompanion[ArrayLongAggregate]{

  def apply(
    arrayLong: Array[Long] = Array.empty
  ) = {
    new ArrayLongAggregate(
      _locator = None
    , _URI = null
    , _arrayLong = arrayLong)
  }

}
