package com.dslplatform.ocd.aggregates.ArrayBoolInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration
import com.fasterxml.jackson.annotation._

class ArrayBoolAggregate @JsonIgnore() private(
    private var _URI: String,
    @transient private val _locator: Option[ServiceLocator],
    private var _arrayBool: Array[Boolean]
  ) extends Serializable with AggregateRoot {

  @JsonGetter("URI")
  def URI = {
    _URI
  }

  private[ArrayBoolInAggregate]def URI_= (value: String) {
    _URI = value

  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: ArrayBoolAggregate => c.URI == URI
    case _ => false
  }

  override def toString = "ArrayBoolAggregate("+ URI +")"

  @transient private lazy val _crudProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[CrudProxy]
  @transient private lazy val _domainProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[DomainProxy]

  def updateWithAnother(result: com.dslplatform.ocd.aggregates.ArrayBoolInAggregate.ArrayBoolAggregate): this.type = {
    this.URI = result.URI;
    this._arrayBool = result._arrayBool;
    this
  }
  def delete()(implicit ec: ExecutionContext, duration: Duration) =
    Await.result( _crudProxy.delete[com.dslplatform.ocd.aggregates.ArrayBoolInAggregate.ArrayBoolAggregate](URI), duration)

  def persist()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result((if (this.URI == null) _crudProxy.create(this) else _crudProxy.update(this)), duration)
    updateWithAnother(toUpdateWith)

  }

  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  @JsonGetter("arrayBool")
  def arrayBool = {
    _arrayBool
  }

  def arrayBool_= (value: Array[Boolean]) {
    _arrayBool = value

  }

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: ServiceLocator
  , @JsonProperty("URI") URI: String
  , @JsonProperty("arrayBool") arrayBool: Array[Boolean]
  ) =
    this(_locator = Some(_locator), _URI = URI, _arrayBool = if (arrayBool == null) Array.empty else arrayBool)

}

object ArrayBoolAggregate extends AggregateRootCompanion[ArrayBoolAggregate]{

  def apply(
    arrayBool: Array[Boolean] = Array.empty
  ) = {
    new ArrayBoolAggregate(
      _locator = None
    , _URI = null
    , _arrayBool = arrayBool)
  }

}
