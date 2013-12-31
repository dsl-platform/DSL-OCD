package com.dslplatform.ocd.aggregates.ArrayOptIntInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration
import com.fasterxml.jackson.annotation._

class ArrayOptIntAggregate @JsonIgnore() private(
    private var _URI: String,
    @transient private val _locator: Option[ServiceLocator],
    private var _arrayOptInt: Array[Option[Int]]
  ) extends Serializable with AggregateRoot {

  @JsonGetter("URI")
  def URI = {
    _URI
  }

  private[ArrayOptIntInAggregate]def URI_= (value: String) {
    _URI = value

  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: ArrayOptIntAggregate => c.URI == URI
    case _ => false
  }

  override def toString = "ArrayOptIntAggregate("+ URI +")"

  @transient private lazy val _crudProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[CrudProxy]
  @transient private lazy val _domainProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[DomainProxy]

  def updateWithAnother(result: com.dslplatform.ocd.aggregates.ArrayOptIntInAggregate.ArrayOptIntAggregate): this.type = {
    this.URI = result.URI;
    this._arrayOptInt = result._arrayOptInt;
    this
  }
  def delete()(implicit ec: ExecutionContext, duration: Duration) =
    Await.result( _crudProxy.delete[com.dslplatform.ocd.aggregates.ArrayOptIntInAggregate.ArrayOptIntAggregate](URI), duration)

  def persist()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result((if (this.URI == null) _crudProxy.create(this) else _crudProxy.update(this)), duration)
    updateWithAnother(toUpdateWith)

  }

  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  @JsonGetter("arrayOptInt")
  def arrayOptInt = {
    _arrayOptInt
  }

  def arrayOptInt_= (value: Array[Option[Int]]) {
    _arrayOptInt = value

  }

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: ServiceLocator
  , @JsonProperty("URI") URI: String
  , @JsonProperty("arrayOptInt") arrayOptInt: Array[Option[Int]]
  ) =
    this(_locator = Some(_locator), _URI = URI, _arrayOptInt = if (arrayOptInt == null) Array.empty else arrayOptInt)

}

object ArrayOptIntAggregate extends AggregateRootCompanion[ArrayOptIntAggregate]{

  def apply(
    arrayOptInt: Array[Option[Int]] = Array.empty
  ) = {
    new ArrayOptIntAggregate(
      _locator = None
    , _URI = null
    , _arrayOptInt = arrayOptInt)
  }

}
