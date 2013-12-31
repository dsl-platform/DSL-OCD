package com.dslplatform.ocd.aggregates.ArrayOptLongInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration
import com.fasterxml.jackson.annotation._

class ArrayOptLongAggregate @JsonIgnore() private(
    private var _URI: String,
    @transient private val _locator: Option[ServiceLocator],
    private var _arrayOptLong: Array[Option[Long]]
  ) extends Serializable with AggregateRoot {

  @JsonGetter("URI")
  def URI = {
    _URI
  }

  private[ArrayOptLongInAggregate]def URI_= (value: String) {
    _URI = value

  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: ArrayOptLongAggregate => c.URI == URI
    case _ => false
  }

  override def toString = "ArrayOptLongAggregate("+ URI +")"

  @transient private lazy val _crudProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[CrudProxy]
  @transient private lazy val _domainProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[DomainProxy]

  def updateWithAnother(result: com.dslplatform.ocd.aggregates.ArrayOptLongInAggregate.ArrayOptLongAggregate): this.type = {
    this.URI = result.URI;
    this._arrayOptLong = result._arrayOptLong;
    this
  }
  def delete()(implicit ec: ExecutionContext, duration: Duration) =
    Await.result( _crudProxy.delete[com.dslplatform.ocd.aggregates.ArrayOptLongInAggregate.ArrayOptLongAggregate](URI), duration)

  def persist()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result((if (this.URI == null) _crudProxy.create(this) else _crudProxy.update(this)), duration)
    updateWithAnother(toUpdateWith)

  }

  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  @JsonGetter("arrayOptLong")
  def arrayOptLong = {
    _arrayOptLong
  }

  def arrayOptLong_= (value: Array[Option[Long]]) {
    _arrayOptLong = value

  }

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: ServiceLocator
  , @JsonProperty("URI") URI: String
  , @JsonProperty("arrayOptLong") arrayOptLong: Array[Option[Long]]
  ) =
    this(_locator = Some(_locator), _URI = URI, _arrayOptLong = if (arrayOptLong == null) Array.empty else arrayOptLong)

}

object ArrayOptLongAggregate extends AggregateRootCompanion[ArrayOptLongAggregate]{

  def apply(
    arrayOptLong: Array[Option[Long]] = Array.empty
  ) = {
    new ArrayOptLongAggregate(
      _locator = None
    , _URI = null
    , _arrayOptLong = arrayOptLong)
  }

}
