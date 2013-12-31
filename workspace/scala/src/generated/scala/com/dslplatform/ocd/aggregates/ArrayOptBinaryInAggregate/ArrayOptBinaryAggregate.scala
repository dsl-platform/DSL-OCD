package com.dslplatform.ocd.aggregates.ArrayOptBinaryInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration
import com.fasterxml.jackson.annotation._

class ArrayOptBinaryAggregate @JsonIgnore() private(
    private var _URI: String,
    @transient private val _locator: Option[ServiceLocator],
    private var _arrayOptBinary: Array[Option[Array[Byte]]]
  ) extends Serializable with AggregateRoot {

  @JsonGetter("URI")
  def URI = {
    _URI
  }

  private[ArrayOptBinaryInAggregate]def URI_= (value: String) {
    _URI = value

  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: ArrayOptBinaryAggregate => c.URI == URI
    case _ => false
  }

  override def toString = "ArrayOptBinaryAggregate("+ URI +")"

  @transient private lazy val _crudProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[CrudProxy]
  @transient private lazy val _domainProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[DomainProxy]

  def updateWithAnother(result: com.dslplatform.ocd.aggregates.ArrayOptBinaryInAggregate.ArrayOptBinaryAggregate): this.type = {
    this.URI = result.URI;
    this._arrayOptBinary = result._arrayOptBinary;
    this
  }
  def delete()(implicit ec: ExecutionContext, duration: Duration) =
    Await.result( _crudProxy.delete[com.dslplatform.ocd.aggregates.ArrayOptBinaryInAggregate.ArrayOptBinaryAggregate](URI), duration)

  def persist()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result((if (this.URI == null) _crudProxy.create(this) else _crudProxy.update(this)), duration)
    updateWithAnother(toUpdateWith)

  }

  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  @JsonGetter("arrayOptBinary")
  def arrayOptBinary = {
    _arrayOptBinary
  }

  def arrayOptBinary_= (value: Array[Option[Array[Byte]]]) {
    _arrayOptBinary = value

  }

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: ServiceLocator
  , @JsonProperty("URI") URI: String
  , @JsonProperty("arrayOptBinary") arrayOptBinary: Array[Option[Array[Byte]]]
  ) =
    this(_locator = Some(_locator), _URI = URI, _arrayOptBinary = if (arrayOptBinary == null) Array.empty else arrayOptBinary)

}

object ArrayOptBinaryAggregate extends AggregateRootCompanion[ArrayOptBinaryAggregate]{

  def apply(
    arrayOptBinary: Array[Option[Array[Byte]]] = Array.empty
  ) = {
    new ArrayOptBinaryAggregate(
      _locator = None
    , _URI = null
    , _arrayOptBinary = arrayOptBinary)
  }

}
