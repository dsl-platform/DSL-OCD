package com.dslplatform.ocd.aggregates.ArrayOptBoolInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration
import com.fasterxml.jackson.annotation._

class ArrayOptBoolAggregate @JsonIgnore() private(
    private var _URI: String,
    @transient private val _locator: Option[ServiceLocator],
    private var _arrayOptBool: Array[Option[Boolean]]
  ) extends Serializable with AggregateRoot {

  @JsonGetter("URI")
  def URI = {
    _URI
  }

  private[ArrayOptBoolInAggregate]def URI_= (value: String) {
    _URI = value

  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: ArrayOptBoolAggregate => c.URI == URI
    case _ => false
  }

  override def toString = "ArrayOptBoolAggregate("+ URI +")"

  @transient private lazy val _crudProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[CrudProxy]
  @transient private lazy val _domainProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[DomainProxy]

  def updateWithAnother(result: com.dslplatform.ocd.aggregates.ArrayOptBoolInAggregate.ArrayOptBoolAggregate): this.type = {
    this.URI = result.URI;
    this._arrayOptBool = result._arrayOptBool;
    this
  }
  def delete()(implicit ec: ExecutionContext, duration: Duration) =
    Await.result( _crudProxy.delete[com.dslplatform.ocd.aggregates.ArrayOptBoolInAggregate.ArrayOptBoolAggregate](URI), duration)

  def persist()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result((if (this.URI == null) _crudProxy.create(this) else _crudProxy.update(this)), duration)
    updateWithAnother(toUpdateWith)

  }

  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  @JsonGetter("arrayOptBool")
  def arrayOptBool = {
    _arrayOptBool
  }

  def arrayOptBool_= (value: Array[Option[Boolean]]) {
    _arrayOptBool = value

  }

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: ServiceLocator
  , @JsonProperty("URI") URI: String
  , @JsonProperty("arrayOptBool") arrayOptBool: Array[Option[Boolean]]
  ) =
    this(_locator = Some(_locator), _URI = URI, _arrayOptBool = if (arrayOptBool == null) Array.empty else arrayOptBool)

}

object ArrayOptBoolAggregate extends AggregateRootCompanion[ArrayOptBoolAggregate]{

  def apply(
    arrayOptBool: Array[Option[Boolean]] = Array.empty
  ) = {
    new ArrayOptBoolAggregate(
      _locator = None
    , _URI = null
    , _arrayOptBool = arrayOptBool)
  }

}
